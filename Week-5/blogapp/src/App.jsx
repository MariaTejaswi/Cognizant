// Q4
// import Posts from "./Posts";

// function App() {

//   return (
//     <Posts />
//   );

// }

// export default App;

// -------------------------------------------------------------------------------------

// Q5
// import "./App.css";
import { CohortsData } from "./Cohort";
import CohortDetails from "./CohortDetails";

function App() {
  return (
    <div>
      <h1>Cohort Details</h1>

      {CohortsData.map((cohort, index) => (
        <CohortDetails
          key={index}
          cohort={cohort}
        />
      ))}
    </div>
  );
}

export default App;