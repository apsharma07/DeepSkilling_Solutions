import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    // Generate a random reference number
    const referenceNumber = 'REF' + Math.floor(1000 + Math.random() * 9000);

    // Show alert with the submission details
    alert(`Complaint Submitted!\nName: ${employeeName}\nComplaint: ${complaint}\nReference No: ${referenceNumber}`);

    // Reset the form
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={{ padding: '20px', maxWidth: '500px', margin: 'auto' }}>
      <h2>Complaint Register</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '10px' }}>
          <label>Employee Name:</label><br />
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            required
            style={{ width: '100%', padding: '8px' }}
          />
        </div>
        <div style={{ marginBottom: '10px' }}>
          <label>Complaint:</label><br />
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            required
            style={{ width: '100%', padding: '8px', minHeight: '100px' }}
          ></textarea>
        </div>
        <button type="submit" style={{ padding: '8px 16px' }}>Submit</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
