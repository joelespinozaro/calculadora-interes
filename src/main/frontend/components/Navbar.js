import Login from "./Login";
import Register from "./Register";

export default function Navbar({ user, setUser }) {
  return (
    <header className="bg-white py-3">
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="flex items-center justify-between">
          <div className="flex items-center">
            <img
              className="h-8 mr-2 rounded-md"
              src="../favicon.ico"
              alt="logo"
            />
            <span className="text-xl text-black hidden sm:block">
              Calculadora de interés
            </span>
          </div>
          <div>
            {typeof user === "undefined" ? (
              <>
                <Register setUser={setUser} />
                <Login setUser={setUser} />
              </>
            ) : (
              <span>
                Hola,
                <strong> {user.client}</strong>
              </span>
            )}
          </div>
        </div>
      </div>
    </header>
  );
}
