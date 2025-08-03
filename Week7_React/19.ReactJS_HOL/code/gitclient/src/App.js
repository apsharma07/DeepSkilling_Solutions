// src/App.js
import React, { useEffect, useState } from "react";
import GitClient from "./GitClient";

function App() {
  const [repos, setRepos] = useState([]);
  const gitClient = new GitClient();

  useEffect(() => {
    const fetchData = async () => {
      const repoNames = await gitClient.getRepositories("techiesyed");
      setRepos(repoNames);
    };

    fetchData();
  }, []);

  return (
    <div className="App">
      <h2>GitHub Repositories</h2>
      <ul>
        {repos.map((repo, idx) => (
          <li key={idx}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
