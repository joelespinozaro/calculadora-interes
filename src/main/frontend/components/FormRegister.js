import { useState } from "react";

export default function FormRegister({ onClick }) {
  const [errorMsg, setErrorMsg] = useState("");
  const onSubmit = (e) => {
    e.preventDefault();
    const body = {
      client: e.target.nombre.value,
      cardIdNumber: e.target.dni.value,
      address: e.target.email.value,
      clientId: 0,
    };
    console.log(body);
    try {
      fetch("http://localhost:8090/calculado-interes/api/client/save", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(body),
        redirect: "follow",
      })
        .then((res) => res.json())
        .then((data) => console.log(data));
    } catch (error) {
      setErrorMsg(error.data.message);
    }
  };

  return (
    <form className="my-5" onSubmit={onSubmit}>
      <div className="my-4">
        <dt className="text-sm font-medium text-gray-500">
          Nombres y Apellidos
        </dt>
        <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
          <input
            id="nombre"
            name="nombre"
            type="text"
            autoComplete="off"
            className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
            placeholder="Ingresar nombres y apellidos"
            required
          />
        </dd>
      </div>
      <div className="my-4">
        <dt className="text-sm font-medium text-gray-500">DNI o RUC</dt>
        <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
          <input
            id="dni"
            name="dni"
            type="text"
            autoComplete="off"
            className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
            placeholder="Ingresar DNI o RUC"
            required
          />
        </dd>
      </div>{" "}
      <div className="my-4">
        <dt className="text-sm font-medium text-gray-500">
          Correo Electrónico
        </dt>
        <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
          <input
            id="email"
            name="email"
            type="email"
            autoComplete="off"
            className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
            placeholder="Ingresar correo electrónico"
            required
          />
        </dd>
      </div>
      <div className="flex justify-between">
        <button
          class="w-2/5 items-center rounded-md bg-blue-700 text-white font-bold py-2 col-span-2"
          type="submit"
        >
          Registrarse
        </button>
        <button
          class="w-2/5 items-center rounded-md text-blue-900 bg-blue-100 font-bold py-2 col-span-2"
          type="submit"
          onClick={onClick}
        >
          Cancelar
        </button>
      </div>
    </form>
  );
}
