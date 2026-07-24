import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div className="container">

      <div className="box">
        {showCourses && <CourseDetails />}
      </div>

      <div className="box">
        {showBooks ? <BookDetails /> : <p>No Books</p>}
      </div>

      <div className="box">
        {showBlogs ? <BlogDetails /> : <p>No Blogs</p>}
      </div>

    </div>
  );
}

export default App;