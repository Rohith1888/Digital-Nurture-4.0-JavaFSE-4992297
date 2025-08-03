import React from 'react';

const CourseDetails = ({ show }) => {
  return show ? ( 
    <>
      <h2>Angular</h2>
      <p>4/5/2021</p>
      <h2>React</h2>
      <p>6/3/2021</p>
    </>
  ) : (
    <p>No course details to display</p>
  );
};

export default CourseDetails;
