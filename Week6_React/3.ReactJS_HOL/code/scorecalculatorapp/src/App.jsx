import React from 'react'
import CalculateScore from './components/CalculateScore'

const App = () => {
  return (
    <div>
      <CalculateScore Name={"Ankit"}
      School={"Crescent Public School"}
      goal={500}
      total={416}/>
    </div>
  )
}

export default App
