import React, { useState } from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

const App = () => {
  const [showBlog, setShowBlog] = useState(true);
  const [showCourse, setShowCourse] = useState(true);

  const books = [
    { id: 101, bname: 'Master React', price: 670 },
    { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
    { id: 103, bname: 'Mongo Essentials', price: 450 },
  ];

  return (
    <div className="container">
      <div className="column st2">
        <h1>Book Details</h1>
        <BookDetails books={books} />
      </div>

      <div className="column v1">
        <h1>Blog Details</h1>
        {showBlog && <BlogDetails showBlog={true} />}
      </div>

      <div className="column mystyle1">
        <h1>Course Details</h1>
        <CourseDetails show={showCourse} />
      </div>
    </div>
  );
};

export default App;
