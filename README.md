# Product Backlog

## Task

| ID | Task                                                                                                                                                                                                                                                                                                                                          |
|----|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1  | The team architect is unfortunately ill, and the product owner has asked you to create a high-level architecture to realize user stories 1-4. The other day he wanted you to sketch your proposal on the whiteboard to discuss with him how the requirements might be realized.                                                               |
| 2  | Before the refinement meeting, you have been asked to refine user story 2 by so-called developer tasks. In our project, a developer task can be completed within 8-16 hours including the necessary activities to ensure the required quality. Please refine user story 2.                                                                    |
| 3  | Your chief security officer asked you about the progress of user story 3 and what it would mean to transmit and store data with a public cloud provider. In particular, Amazon Web Services is her favorite. Since she does not have the relevant information about the security of a cloud provider you start to explain her the principles. |
| 4  | Due to the high-pressure of the project, it is required to make use of 3rd party components for user story 4. The visualization is considered as one of the topics that has high complexity. Therefore, you volunteer to identify one visualization framework and describe why it is useful for the given application.                        |

## Solution

| ID | Solution                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
|----|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1  | [The Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| 1  | ![drivers.svg](doc/uml/svg/sewer.svg)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| 2  | [Refinement](#refinement)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 3  | [What is Amazon Cognito?](https://docs.aws.amazon.com/de_de/cognito/latest/developerguide/what-is-amazon-cognito.html) (provides HTTPS out of the box) <br> To enhance security, it's recommended not to process raw data directly. Instead, consider manual encryption using techniques like hashing or salting. [encryption-hashing-salting](https://www.thesslstore.com/blog/difference-encryption-hashing-salting/)                                                                                                                                                                                   |
| 4  | Visualization Framework: [Chart.js](https://www.chartjs.org/) (best practice) <br> **Why Chart.js is Useful for the given task** <br> - **Ease of Use:** Simple API for quick implementation. <br> - **Wide Range of Chart Types:** Supports complex, multi-axis visualizations. <br> - **Customization:** Highly customizable to meet specific needs. <br> - **Performance:** Efficient handling of large data sets with smooth rendering. <br> - **Community Support:** Extensive resources and regular updates. <br> - **Personal Experience:** Proven reliability and effectiveness in past projects. |

## Refinement

### Task: calculate which sewers are likely to overflow before the event happens:

###### Developer Tasks

| ID | Task Description                                                |
|----|-----------------------------------------------------------------|
| 1  | BDD acceptance-test -> [rest-assured](https://rest-assured.io/) |
| 2  | **test indication & observation**                               |
| 2a | rain                                                            |
| 2b | flow                                                            |
| 2c | pump                                                            |
| 2d | in combination of several indications                           |
