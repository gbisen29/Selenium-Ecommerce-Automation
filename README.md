# Selenium Automation Framework (Java)

## Project Overview
This project is a Selenium Automation Framework built using Java and TestNG.  
The framework is designed with a focus on maintainability, reusability, and clear separation of responsibilities, following industry best practices.

This project was created to demonstrate hands-on automation framework design rather than tool usage alone.

---

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- GitHub

---

## Framework Type
Hybrid Automation Framework  
(Page Object Model + Utility-based design)

---

## Project Structure
- **pages**  
  Contains Page Object classes that define UI locators and user interactions.

- **utilities**  
  Contains reusable helper classes for:
  - Explicit waits
  - Mouse and keyboard actions
  - Dropdown handling
  - Alerts handling
  - Frame and window handling

- **base**  
  Contains base test setup logic such as browser initialization and teardown.

- **testcases**  
  Contains TestNG test classes with test flow and assertions.

---

## Key Design Principles
- Page classes contain only UI interaction logic
- Utility classes handle common Selenium operations
- Test classes contain only test flow and assertions
- Explicit waits are used instead of hard waits
- Code is structured to be readable and interview-explainable

---

## Test Execution
- Tests can be executed directly from TestNG test classes.
- The framework supports structured execution using TestNG annotations and grouping concepts.

---

## Learning Outcomes
- Practical understanding of Selenium framework architecture
- Implementation of Page Object Model
- Handling of synchronization, alerts, frames, and windows
- Experience with TestNG execution control
- Version control using GitHub with incremental commits

---

## Note
This framework is intended to demonstrate framework design and automation concepts for interview and learning purposes.
