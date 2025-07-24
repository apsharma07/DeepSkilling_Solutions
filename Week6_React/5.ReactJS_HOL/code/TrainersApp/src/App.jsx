import React from 'react';
import { Link, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import TrainerList from './components/TrainerList';
import TrainerDetails from './components/TrainerDetails';
import trainers from './components/TrainersMock';

const App = () => {
  return (
    <>
    <div>
            <h1>My Trainers Academy</h1>
          </div>
          <div>
            <nav>
              <Link to="/">Home</Link> |{" "}
              <Link to="/trainers">Trainers</Link>
            </nav>
      <hr />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainerList trainers={trainers} />} />
        <Route path="/trainers/:id" element={<TrainerDetails />} />
      </Routes>
    </div>
    </>
  );
};

export default App;
