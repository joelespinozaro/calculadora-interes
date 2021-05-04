import { useState } from "react";
import FormularioCalculadora from "./FormularioCalculadora";
import Navbar from "./Navbar";
import Result from "./Result";

export default function HomeView() {
  const [user, setUser] = useState();
  const [result, setResult] = useState();
  return (
    <>
      <Navbar setUser={setUser} user={user} />
      {user ? (
        <div className="min-h-screen bg-gray-200">
          <FormularioCalculadora user={user} setResult={setResult} />
          {result && <Result result={result} />}
        </div>
      ) : (
        <h1 className="text-center mt-10 text-2xl">
          Iniciar sesión para poder utilizar la calculadora
        </h1>
      )}
    </>
  );
}
