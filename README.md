# Friend match application (backend)

> Mobile app based on Vue 3 and Spring Boot 2 that helps users find like-minded partners.

Backend repository: https://github.com/RA42-y/friend-match-backend

Frontend repository: https://github.com/RA42-y/friend-match-frontend

## Features

- User Registration and Management: Users can register and create their own profile in the app. They can manage their profile information and update it at any time.
- Tag-based User Search: This app allows users to search for other users based on tags. Users can search for multiple tags to find others with certain interests and skills.
- Similar User Recommendation: This app recommends similar users based on the tags users set for themselves. The recommendation algorithm is based on the Levenshtein distance algorithm, which calculates the similarity between tags. This helps users find potential partners quickly and efficiently.
- Team Formation: Users can form teams with other users who share similar interests and skills. Users can create a new team or join an existing team, including public and private teams. The platform also allows team members to communicate and collaborate on projects. This helps users achieve their goals more effectively.

## Tech Stack

### Frontend

**Main technologies:**

- 🌟 Vue3: Progressive framework for building web applications.
- 💼 Typescript: Superset of JavaScript that provides type safety for code.
- 🌐 HTML: Markup language used for creating web pages.
- 🎨 CSS: Styling language used for styling web pages.

**Dependent libraries:**

- 🪜 Vant UI: Mobile web component library for building mobile apps.
- 🚀 Vite: Build tool for fast and efficient development server and build time.
- 🔗 Axios: Promise-based HTTP client for communicating with the backend API.

### Backend

**Main technologies:**

- ☕️ Java: Popular programming language with Java 8 features for code optimization.
- 🍃 SpringBoot 2.7: Java framework for fast and easy application development.
- 🗄️ MySQL: Powerful relational database for scalable and reliable data storage.
- 🏢 MyBatis: Persistence layer framework for easy interaction with the database.
- 🔄 Redis: Key-value storage system for fast and efficient data storage.
- ⏰ Spring Scheduler: Framework for simple task scheduling.

**Dependent libraries:**

- 🧩 MyBatis X: Configuration plugin for generating configuration files for MyBatis.
- 🔐 Redisson: Distributed locks library for providing a distributed lock service for Redis.
- 📚 Swagger + Knife4j: Library for organizing interface documentation.
- 🍬 Gson: Library for serializing and deserializing JSON data.

## Getting Started

### Install

#### Backend

1. Clone the backend Git repository to your local machine:

    ```shell
    git clone https://github.com/RA42-y/friend-match-backend.git
    ```

2. Navigate to the backend directory:

    ```shell
    cd friend-match-backend
    ```

3. Install Maven dependencies:

    ```shell
    mvn clean install -DskipTests
    ```

4. Configure MySQL database:

    - Create a new MySQL database named `friend-match`.
    - Update the MySQL connection details in the `application.yml` file located in `friend-match-backend/src/main/resources/application.yml`. Set the values for `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password`.

5. Start Redis:

    ```shell
    redis-server
    ```

    If Redis is not installed, please follow the instructions provided in the [official Redis documentation](https://redis.io/topics/quickstart).

6. Start the application:

    ```shell
    mvn spring-boot:run
    ```

    The backend application will start on `http://localhost:8080`. The online RESTful APIs Documentation will be on `http://localhost:8080/api/doc.html#/home`.

Congratulations! You have successfully installed and started the backend application. Now, you can proceed to set up the frontend application.

#### Frontend

7. Clone the frontend Git repository to your local machine:

    ```shell
    git clone https://github.com/RA42-y/friend-match-frontend.git
    ```

8. Navigate to the frontend directory:

    ```shell
    cd friend-match-frontend
    ```

9. Install Node.js and npm:

    - Install Node.js from the [official Node.js website](https://nodejs.org/en/download/).

    - Verify that Node.js and npm are installed by running the following commands:

        ```shell
        node -v
        npm -v
        ```

10. Install project dependencies:

    ```shell
    npm install
    ```

11. Start the frontend application:

    ```shell
    npm run dev
    ```

    The frontend application will start on `http://localhost:5173`.

Congratulations! You have successfully installed and started the frontend application. Now, you can open the application in your web browser and start using it.

### Usage

1. After entering the app, users can log in.
2. Users can view and update their own personal information.
3. Users can search for other users by tags and view their personal information .
4. Users can view similar users recommended to them.
5. Users can create and join teams and view team information and member information.

## Interface

### Home page

The home page is the landing page of the application. By default, it displays a list of users ordered by their user code. Users can also switch to the matching mode, where the list of users is ordered by the similarity of tags according to the current login user.

<p>
  <img src="assets/home.png" width="30%" />
  <img src="assets/home-matching.png" width="30%" /> 
</p>

### User Search

Users can search for other users based on selected tags. The list of users who have the selected tags will be displayed.

<p float="left">
  <img src="assets/search-tags.png" width="30%" />
  <img src="assets/search-results.png" width="30%" /> 
</p>

### Teams

The Teams page shows a list of public or private teams. Users can create a new team by filling out a form.

<p float="left">
  <img src="assets/team-public.png" width="30%" />
  <img src="assets/team-private.png" width="30%" /> 
  <img src="assets/team-add-form.png" width="30%" />
</p>

### User Info

The User Info page is only accessible to logged-in users. Users can update their personal information by clicking on the corresponding section.

<p float="left">
  <img src="assets/login.png" width="30%" />
  <img src="assets/user.png" width="30%" />
  <img src="assets/user-update-info.png" width="30%" /> 
</p>

## API

Backend RESTful API documentation: [friend-match-backend-api-v1.md](assets/friend-match-backend-api-v1.md)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.md) file for details.
