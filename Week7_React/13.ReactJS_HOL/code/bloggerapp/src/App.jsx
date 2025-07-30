import React from "react";

function App() {
  const courses = [
    { name: "Angular", date: "4/5/2021" },
    { name: "React", date: "6/3/20201" }, 
  ];

  const books = [
    { title: "Master React", price: 670 },
    { title: "Deep Dive into Angular 11", price: 800 },
    { title: "Mongo Essentials", price: 450 },
  ];

  const blogs = [
    {
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!",
    },
    {
      title: "Installation",
      author: "Schewzdenier",
      content: "You can install React from npm.",
    },
  ];

  return (
    <div style={{ display: "flex", padding: "30px", fontFamily: "Arial" }}>
      {/* Course Details */}
      <div style={{ flex: 1 }}>
        <h2>Course Details</h2>
        {courses.map((course, i) => (
          <div key={i}>
            <h3>{course.name}</h3>
            <p>{course.date}</p>
          </div>
        ))}
      </div>
      <div
        style={{
          width: "2px",
          backgroundColor: "green",
          margin: "0 20px",
        }}
      ></div>
      <div style={{ flex: 1 }}>
        <h2>Book Details</h2>
        {books.map((book, i) => (
          <div key={i}>
            <h3>{book.title}</h3>
            <p>{book.price}</p>
          </div>
        ))}
      </div>
      <div
        style={{
          width: "2px",
          backgroundColor: "green",
          margin: "0 20px",
        }}
      ></div>
      <div style={{ flex: 1 }}>
        <h2>Blog Details</h2>
        {blogs.map((blog, i) => (
          <div key={i}>
            <h3>{blog.title}</h3>
            <p>
              <strong>{blog.author}</strong>
            </p>
            <p>{blog.content}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
