# DMS
Distribution Management System

**Our teammates**: Jiao Kaijie, Li Runfa, Meng Weihao.

**Description**: Our aim is not going on the whole system, we would like to implement the most main features, like car management, stock management, etc. And the project (web app) will based on MVC architecture, we will apply Spring Boot as the back-end and the Vue.js will support the front-end.



## Environment Set Up

- Set up the GitHub on your machine
  - Set up
    - Mac: https://medium.com/@aklson_DS/how-to-properly-setup-your-github-repository-mac-version-3a8047b899e5
    - Windows: https://www.youtube.com/watch?v=wSQ-vCAiOw0&list=PL7slAxcLWlcCetian9RRoVZ_N3Ct5L_h3&index=2
  - Git
    - Git Command tips: https://backlog.com/git-tutorial/cn/stepup/stepup1_1.html
    - Git in **Intellij**: very useful for us and PLEASE read it
      - Fetch, Pull and Updata
        - https://www.jetbrains.com/help/idea/sync-with-a-remote-repository.html
      - Commit and Push
        - https://www.jetbrains.com/help/idea/commit-and-push-changes.html
      - Branch
        - https://www.jetbrains.com/help/idea/manage-branches.html
        - https://www.jetbrains.com/help/idea/apply-changes-from-one-branch-to-another.html
      - Code conflicts
        - https://www.jetbrains.com/help/idea/resolve-conflicts.html
      - Tag commits
        - https://www.jetbrains.com/help/idea/use-tags-to-mark-specific-commits.html
- Which IDE will be used by us?

  - ABS **Intellij IDEA**
  - (OPTIONAL) You can use your student email(e.g. xxx@inf.elte.hu, xxx@student.elte.hu) to get the **Free Education Licenses** from JetBrains (link: https://www.jetbrains.com/community/education/#students) so that you can immediately use the  **IntelliJ IDEA Ultimate** edition.
  - After, download it
- How to clone the project to LOCAL?

  - open **gitbash**(for windows, just right click your mouse in the specific folder, which you want to store the whole shit)
    - For Mac,  just use your terminal, or download [iTerm2](https://iterm2.com/index.html) to get much better experience! BTW, you can use `brew` if you have!
      - Brew: https://brew.sh/
  - write down the command: `git clone git@github.com:CagyJ/DMS.git` (or https way, whatever!)
- Well done!
- Database?

  - We will use MySQL for sure, so make sure that you have MySQL local environment already
- When you finish to set up your MySQL environment, run the sql file -> [click me](https://github.com/CagyJ/DMS/blob/main/dms/all.sql)
- What else tools needed to use?

  - **Typora**(Necessary, for markdown file, like the current one `README.md`)
  - **Postman**(Useful&Important, but not necessary if you have Intellij Ultimate Edition)

  - **Navicat**(Not necessary)
  - ...
- IMPORTANT REMINDER❗️❗️❗️

  - When you want to add or edit any files, just make sure that you are on the newest HEAD so that ignoring Code Conflicts... So, use `git pull` or Update Project(the blue vcs operation in the Intellij)
    - Details example: https://backlog.com/git-tutorial/cn/stepup/stepup3_1.html
  - If you get something new from your brain and can not talk to others on time, please make a new branch!
    - More info: https://backlog.com/git-tutorial/cn/stepup/stepup2_2.html
- What's NEXT?

  - open your **Intellij IDEA** and run the project
  - open your browser and enter http://localhost:8080/, you will see **Hello World!**
  - Enjoy coding!



## Something You May Know

- Front-end Framework: Vue2 https://vuejs.org/v2/guide/
- Front-end UI Library: Element-ui https://element.eleme.io/#/en-US
- HTTP Client: axios https://axios-http.com/docs/intro
- Toolkit of MyBatis: MyBatis-Plus https://github.com/baomidou/mybatis-plus
- Testing The Web Layer in Springboot: https://spring.io/guides/gs/testing-web/
- GitHub Actions Tutorial(Basic Concepts, CI/CD Pipeline): https://www.youtube.com/watch?v=R8_veQiYBjI
- GitHub Actions for Java Spring Boot Application: https://medium.com/@pk0752/github-actions-standard-workflow-for-java-spring-boot-application-using-maven-sonar-cloud-and-7dcc4190aa82
- Actions in GitHub which will be useful for you
  - checkout https://github.com/actions/checkout
  - setup-java https://github.com/actions/setup-java
  - More in https://github.com/actions





## Errors

- If you face `Access denied for user 'root'@'localhost' (using password: YES)` issue when connecting database, check this
  - https://stackoverflow.com/questions/17975120/access-denied-for-user-rootlocalhost-using-password-yes-no-privileges
- 



## Features



### Login/Logout Page

- Table: user, including user account and password

- Content: User login interface
- one Buttons here (login）  



### Index

- Content: Welcome 'username'
- Sidebar navigation
- User avatar in the upper right corner (logo, profile,log out)
  - design LOGO: https://www.freelogodesign.org/     in the upper left corner
  - ![logo](https://github.com/CagyJ/DMS/raw/main/dms/src/main/webapp/Image/Logo.png)



### Order Management

Table: order

- Content: A list of order
- Included 
- order Id (no...)
- order name
- order Origin and destination
- Car license plate number
- order amount 
- Order Status (not started / in transit / completed)
- if the order have finished will enter the history orders (one button here)
- will be a text box (write some important things in time)
- All important information is indispensable


### Car Management

Table: car

- Car no.
- Driver name
- Driver phone number
- Driver status (free or working)
- Driver address
- Driver ID number
- We need to modify, add, delete operates
- If working, shows the Order number



### History orders

Display all past orders



