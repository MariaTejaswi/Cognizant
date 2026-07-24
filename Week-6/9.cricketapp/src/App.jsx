// Q9 part-1
// import ListofPlayers from "./ListofPlayers";

// function App() {
//   return (
//     <div>
//       <ListofPlayers />
//     </div>
//   );
// }

// export default App;

// ---------------------------------------------------------------------------------------

// Q9 part-2
import ListofPlayers from "./ListofPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {

  const flag = false;

  if (flag) {
    return <ListofPlayers />;
  } else {
    return <IndianPlayers />;
  }

}

export default App;