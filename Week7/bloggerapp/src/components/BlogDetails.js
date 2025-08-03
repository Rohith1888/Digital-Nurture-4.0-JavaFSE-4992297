import React from 'react';

const BlogDetails = ({ showBlog }) => {
  if (!showBlog) return null; // Type 1: Return null

  return (
    <div>
      <h2>React Learning</h2>
      <b>Stephen Biz</b>
      <p>Welcome to learning React!</p>

      <h2>Installation</h2>
      <b>Schwezdenier</b>
      <p>You can install React from npm.</p>
    </div>
  );
};

export default BlogDetails;
