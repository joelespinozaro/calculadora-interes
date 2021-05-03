export default function FormularioCalculadora() {
  const onSubmit = (e) => {
    e.preventDefault();
    const body = {
      capital: parseFloat(e.currentTarget.capital.value),
      interes: e.currentTarget.interes.value / 100,
      meses: parseFloat(e.currentTarget.meses.value),
      tipo: parseInt(e.currentTarget.tipo.value),
    };
    console.log(body);
  };

  return (
    <div className="min-h-screen bg-gray-200">
      <div className="max-w-2xl mx-auto py-8 px-4 sm:px-6 lg:px-8">
        <div className="bg-white shadow overflow-hidden sm:rounded-lg">
          <div className="px-4 py-5 sm:px-6">
            <h3 className="text-lg leading-6 font-medium text-gray-900">
              Calculadora de interés
            </h3>
            <p className="mt-1 max-w-2xl text-sm text-gray-500">
              Ingresar la información solicitada para calcular el interés
            </p>
          </div>
          <form className="border-t border-gray-200" onSubmit={onSubmit}>
            <dl>
              <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
                <dt className="text-sm font-medium text-gray-500">
                  Capital Inicial
                </dt>
                <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
                  <input
                    id="capital"
                    name="capital"
                    type="number"
                    autoComplete="capital"
                    className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
                    placeholder="Ingresar capital inicial"
                    required
                  />
                </dd>
              </div>
              <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
                <dt className="text-sm font-medium text-gray-500">
                  Tasa de Interés (%)
                </dt>
                <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
                  <input
                    id="interes"
                    name="interes"
                    type="number"
                    autoComplete="interes"
                    className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
                    placeholder="Ingresar tasa de interés"
                    required
                  />
                </dd>
              </div>
              <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
                <dt className="text-sm font-medium text-gray-500">
                  Cantidad de meses
                </dt>
                <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
                  <input
                    id="meses"
                    name="meses"
                    type="number"
                    autoComplete="off"
                    className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
                    placeholder="Ingresar cantidad de meses"
                    required
                  />
                </dd>
              </div>

              <div className="bg-gray-50 px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6">
                <dt className="text-sm font-medium text-gray-500">
                  Tipo de interés
                </dt>
                <dd className="mt-1 text-sm text-gray-900 sm:mt-0 sm:col-span-2">
                  <select
                    id="tipo"
                    name="tipo"
                    name="select"
                    className="rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-md focus:outline-none focus:ring-indigo-500 focus:border-blue-500 focus:z-10 sm:text-sm"
                  >
                    <option value="1">Interés simple</option>
                    <option value="2" selected>
                      Interés compuesto
                    </option>
                  </select>
                </dd>
              </div>

              <div className="bg-white px-4 py-5 sm:grid sm:grid-cols-3 sm:gap-4 sm:px-6 text-center">
                <button
                  class="w-1/2 items-center rounded-md bg-blue-700 text-white font-bold py-2 col-span-2"
                  type="submit"
                >
                  Calcular
                </button>
              </div>
            </dl>
          </form>
        </div>
      </div>
    </div>
  );
}
