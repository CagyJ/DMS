# DMS
Distribution Management System

**Our teammates**: Jiao Kaijie, Li Runfa, Meng Weihao.
**Description**: Our aim is not going on the whole system, we would like to implement the most main features, like car management, stock management, etc. And the project (web app) will based on MVC architecture, we will apply Spring Boot as the back-end and the Vue.js will support the front-end.



## Environment Set Up

- Set up the GitHub on your machine

  - Mac: https://medium.com/@aklson_DS/how-to-properly-setup-your-github-repository-mac-version-3a8047b899e5
  - Windows: https://www.youtube.com/watch?v=wSQ-vCAiOw0&list=PL7slAxcLWlcCetian9RRoVZ_N3Ct5L_h3&index=2
  - Git Command tips: https://backlog.com/git-tutorial/cn/stepup/stepup1_1.html

- Which IDE will be used by us?

  - ABS **Intellij IDEA**
  - (OPTIONAL) You can use your student email(e.g. xxx@inf.elte.hu, xxx@student.elte.hu) to get the **Free Education Licenses** from JetBrains (link: https://www.jetbrains.com/community/education/#students) so that you can immediately use the  **IntelliJ IDEA Ultimate** edition.
  - After, download the 

- How to clone the project to LOCAL?

  - open **gitbash**(for windows, just right click your mouse in the specific folder, which you want to store the whole shit)
    - For Mac, just use your terminal, or download [iTerm2](https://iterm2.com/index.html) to get much better experience! BTW, you can use `brew` if you have!
  - write down the command: `git clone git@github.com:CagyJ/DMS.git` (or https way, whatever!)
  - Well done!

- Database?

  - We will use MySQL for sure, so make sure that you have MySQL local environment already

- What else tools needed to use?

  - **Typora**(Necessary, for markdown file, like the current one `README.md`)
  - **Postman**(Useful&Important, but not necessary)

  - **Navicat**(Not necessary)
  - ...

- IMPORTANT RULES

  - When you want to add or edit any files, just make sure that you are on the newest HEAD so that ignoring Code Conflicts... So, use `git pull`
    - Details example: https://backlog.com/git-tutorial/cn/stepup/stepup3_1.html
  - If you get something new from your brain and can not talk to others on time, please make a new branch!
    - More info: https://backlog.com/git-tutorial/cn/stepup/stepup2_2.html

- What's NEXT?

  - open your **Intellij IDEA** and run the project
  - open your browser and enter http://localhost:8080/, you will see **Hello World!**
  - Enjoy coding!





## Features



### Login/Logout Page

Table: user

- TODO LRF



### Index

TODO MWH

- write content
- Content: Welcome 'username'
- Sidebar navigation
- User avatar in the upper right corner (logo, profile,log out)
- design LOGO: https://www.freelogodesign.org/     in the upper left corner



### Order Management

Table: order

- TODO LRF



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
- TODO MWH



### History orders

Display all past orders



