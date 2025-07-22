import React from 'react'

const CalculateScore = ({Name,School,total,goal}) => {
    const percentToDecimal=(decimal)=>{
        return ((decimal*100).toFixed(2)+'%')
    }
    const calcScore=(total,goal)=>{
        return percentToDecimal(total/goal)
    }
  return (
    <div class="main">
      <h1>Student Details</h1>
      <div >
        <h3 class="name">Name- {Name}</h3>
      </div>
      <div>
        <h3 class="school">School- {School}</h3>
      </div>
      <div>
        <h3 class="total">Total-{total}</h3>
      </div>
      <div>
        <h3 class="percentage">Percentage-{calcScore(total,goal)}</h3>
      </div>
    </div>
  )
}

export default CalculateScore
