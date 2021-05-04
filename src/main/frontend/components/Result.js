export default function Result({ result }) {
  return (
    <div className=" bg-gray-200">
      <div className="max-w-2xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="bg-white shadow overflow-hidden sm:rounded-lg">
          <div className="px-4 py-5 sm:px-6">
            <h3 className="text-lg leading-6 font-medium text-gray-900">
              Resultados de calculadora
            </h3>
            <p className="mt-1 max-w-2xl text-gray-500">
              {/* {JSON.stringify(result)} */}
            </p>
            <div className="p-4 flex sm:items-center flex-col">
              <div className="flex flex-row">
                <div className="flex-none w-40">
                  <span className="text-gray-400 font-semibold">
                    Capital Final
                  </span>
                </div>
                <div className="flex-none w-80  mr-5">
                  <span className="font-semibold mr-2 "></span>
                  <span>{result.capitalFinal}</span>
                </div>
              </div>
              <div className="flex flex-row">
                <div className="flex-none w-40">
                  <span className="text-gray-400 font-semibold">Interés</span>
                </div>
                <div className="flex-none w-80  mr-5">
                  <span className="font-semibold mr-2 "></span>
                  <span>
                    {parseFloat(result.capitalFinal) -
                      parseFloat(result.capital)}
                  </span>
                </div>
              </div>
            </div>
          </div>
          {/* <div className="px-4 pb-5 sm:px-6">
            <h3 className="text-lg leading-6 font-medium text-gray-900">
              Recomendación
            </h3>
            <p className="mt-1 max-w-2xl text-gray-500">
            </p>
            <div className="p-4 flex sm:items-center flex-col">
              <div className="flex flex-row">
                <div className="flex-none w-40">
                  <span className="text-gray-400 font-semibold">Banco</span>
                </div>
                <div className="flex-none w-80  mr-5">
                  <span className="font-semibold mr-2 "></span>
                  <span>{result.capitalFinal}</span>
                </div>
              </div>
              <div className="flex flex-row">
                <div className="flex-none w-40">
                  <span className="text-gray-400 font-semibold">
                    Asesor Financiero
                  </span>
                </div>
                <div className="flex-none w-80  mr-5">
                  <span className="font-semibold mr-2 "></span>
                  <span>
                    {result.recommendation}
                  </span>
                </div>
              </div>
            </div>
          </div> */}
        </div>
      </div>
    </div>
  );
}
