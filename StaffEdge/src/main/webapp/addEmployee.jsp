<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Add Employee</title>
    <link
      href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&display=swap"
      rel="stylesheet"
    />
    <style>
      :root {
        --sp-green: #1db954;
        --sp-green-hover: #1ed760;

        /* WEBPAGE BACKGROUND: More visible light green */
        --body-bg: #d1e8da;

        /* FORM BACKGROUND: Kept your light green theme */
        --form-bg: #edf7f1;

        --input-bg: #ffffff;
        --text-main: #121212;
        --text-muted: #535353;
      }

      * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
      }

      html,
      body {
        height: 100%;
        overflow: hidden;
      }

      body {
        font-family: "Inter", sans-serif;
        background-color: var(--body-bg);
        display: flex;
        justify-content: center;
        align-items: center;
        color: var(--text-main);
        -webkit-font-smoothing: antialiased;
      }

      .container {
        /* Form background color remains as requested */
        background-color: var(--form-bg);
        padding: 24px 40px;
        border-radius: 12px;
        width: 90%;
        max-width: 680px;
        /* Added a slightly stronger shadow to make it pop against the new body color */
        box-shadow: 0 12px 40px rgba(0, 0, 0, 0.08);
        border: 1px solid #c2d6ca;
      }

      h2 {
        font-size: 20px;
        font-weight: 600;
        margin-bottom: 20px;
        text-align: center;
        letter-spacing: -0.3px;
      }

      .form-grid {
        display: grid;
        grid-template-columns: 1fr 1fr;
        column-gap: 28px;
        row-gap: 12px;
      }

      .field-unit {
        display: flex;
        flex-direction: column;
        gap: 5px;
      }

      label {
        font-size: 13px;
        font-weight: 500;
        color: var(--text-main);
      }

      input {
        width: 100%;
        height: 38px;
        background-color: var(--input-bg);
        border: 1px solid var(--sp-green);
        border-radius: 6px;
        padding: 0 12px;
        font-size: 14px;
        font-family: inherit;
        outline: none;
        transition: all 0.2s ease;
      }

      input:focus {
        border-color: #1aa34a;
        box-shadow: 0 0 0 3px rgba(29, 185, 84, 0.15);
      }

      .actions {
        grid-column: 1 / -1;
        display: flex;
        justify-content: center;
        gap: 12px;
        margin-top: 20px;
        padding-top: 16px;
        border-top: 1px solid #c2d6ca;
      }

      .btn {
        height: 40px;
        padding: 0 30px;
        border-radius: 500px;
        font-size: 13px;
        font-weight: 600;
        cursor: pointer;
        border: none;
        transition: all 0.2s ease;
      }

      .btn-cancel {
        background-color: #dee9e2;
        color: var(--text-muted);
      }

      .btn-cancel:hover {
        background-color: #cdd9d1;
        color: var(--text-main);
      }

      .btn-add {
        background-color: var(--sp-green);
        color: white;
      }

      .btn-add:hover {
        background-color: var(--sp-green-hover);
        transform: translateY(-1px);
        box-shadow: 0 4px 12px rgba(29, 185, 84, 0.2);
      }

      @media (max-width: 600px) {
        .form-grid {
          grid-template-columns: 1fr;
        }
        .container {
          padding: 20px;
        }
        html,
        body {
          overflow: auto;
        }
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h2>Add new employee</h2>
      
<form action="addEmployee" method="post" class="form-grid">        
        <div class="field-unit">
          <label>First name</label>
          <input
            type="text"
            name="firstName"
            placeholder="First name"
            required
          />
        </div>
        <div class="field-unit">
          <label>Last name</label>
          <input type="text" name="lastName" placeholder="Last name" required />
        </div>
        <div class="field-unit">
          <label>Email address</label>
          <input
            type="email"
            name="email"
            placeholder="email@example.com"
            required
          />
        </div>
        <div class="field-unit">
          <label>Phone number</label>
          <input type="tel"
            name="phone" 
            pattern="\d{10}" 
            maxlength="10" 
            placeholder="Phone number" 
            title="Enter 10 digit number" 
            required />

        </div>
        <div class="field-unit">
          <label>Age</label>
          <input
            type="number"
            name="age"
            placeholder="Age"
            min="18"
            max="300"
            required
          />
        </div>
        <div class="field-unit">
          <label>Department</label>
          <input
            type="text"
            name="department"
            placeholder="Department name"
            required
          />
        </div>
        <div class="field-unit">
          <label>Salary</label>
          <input
            type="number"
            step="0.01"
            name="salary"
            min="0.01"
            placeholder="Salary amount"
            required
          />
        </div>

        <div class="actions">
          <button
            type="button"
            class="btn btn-cancel"
            onclick="window.history.back()"
          >
            Cancel
          </button>
          <button type="submit" class="btn btn-add">Add employee</button>
        </div>
      </form>
    </div>
  </body>
</html>
