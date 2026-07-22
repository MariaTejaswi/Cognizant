import logo from './logo.svg';
import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 

function App() {
 
  return (
  <div>
    <h1>Cohort Details</h1>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
  </div>
  );
}

export default App;
