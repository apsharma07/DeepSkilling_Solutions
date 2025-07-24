import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
    };
  }
  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      this.setState({ error });
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.error("Error caught in Posts component:", error, info);
    this.setState({ error });
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <h2>Something went wrong while loading posts.</h2>;
    }

    return (
      <div>
        <h1>Posts</h1>
        <ul>
          {posts.map(post => (
            <li key={post.id}><strong>{post.title}</strong><p>{post.body}</p></li>
          ))}
        </ul>
      </div>
    );
  }
}

export default Posts;
