# **Lab1**
# **Objective : Source Code Management**
# **Date : 6th Feb 2020**

# **Theory :**
 
## **Source Code Management**
Source code management (SCM) is used to track modifications to a source code repository. SCM tracks a running history of changes to a code base and helps resolve conflicts when merging updates from multiple contributors. SCM is also synonymous with Version control.
As software projects grow in lines of code and contributor head count, the costs of communication overhead and management complexity also grow. SCM is a critical tool to alleviate the organizational strain of growing development costs.

## **Types of Version Control System**
There are two main types of version control system.

### 1. Centralized Version Control System
The main concept of Centralized Version Control is that it works in a client and server model. The repository is located in one server and can be accessed by multiple connections.It’s very similar to FTP client-server model.All the user changes and commits have to pass through the central server and there is no such thing as a local repo. 

### 2. Distributed Version Control System
These systems are comparatively newer concepts. In Distributed Version Control, each collaborator get their own version of the repository and can make changes and finalize it before actually committing to the original repo. Eg. Git and Mercurial

#### **Git as a Source Code Management**
Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.Git is easy to learn and has a tiny footprint with lightning fast performance. It outclasses SCM tools like Subversion, CVS, Perforce, and ClearCase with features like cheap local branching, convenient staging areas, and multiple workflows.s

**Basic Git Workflow**

![Git Worlkflow](https://github.com/bibekb11/EADLAB/blob/master/Lab1/gitworkflow.png)

**1. Working Directory:**
The Working Directory is the area where a collaborator is currently working. It is where the local files are present. This area is also known as the “untracked” area of git. Any changes to files will be marked and seen in the Working Directory. Here if you make changes and do not explicitly save them to git, you will lose the changes made to your files. Run the command git --status. This command will show you two things: The files in your Working Tree and the files in your Staging Area. It will look something like the image below if you don’t have anything in your Staging Area.We use git --init to initialize the working directory.

**2. Staging Area:**
One of the most essential concepts to Git is that of the staging area. Its use can fundamentally change how you work, for the better! Let’s go over how exactly it works and what you’ll need to know to use it.

With most other version control systems, there’s 2 places to store data: your working copy (the folders/files that you’re currently using) and the datastore (where the version control decides how to pack and store your changes). In Git there’s a third option: the staging area (or index). It’s basically a loading dock where you get to determine what changes get shipped away.
Since the working directory and what gets saved by Git are essentially decoupled, this allows the developer to build up their commits however they want, and not in a fashion where the VCS tells you. Since there’s a layer between when Git actually saves the data, you gain a lot more flexibility and control.

Using the index is quite simple with the git add and git commit commands. Basically, you add files onto the index, and once you’re satisfied with the changes commit them.

Once they’re in the repository you can push them to remote locations, merge them into other branches, and much more. There’s also actions that can be performed on the staging area itself, such as temporarily stashing your changes.

**3. Repository**
There are namely two distinct repositories in github. They are:

**Local Repository:**
The Local Repository is everything in your .git directory. Mainly what you will see in your Local Repository are all of your checkpoints or commits. It is the area that saves everything (so don’t delete it). That’s it.How do you add items from your Staging Area to your Local Repository? The git command git commit takes all changes in the Staging Area, wraps them together and puts them in your Local Repository. A commit is simply a checkpoint telling git to track all changes that have occurred up to this point using our last commit as a comparison. After committing, your Staging Area will be empty.

**Remote Repository**
A remote in Git is a common repository that all team members use to exchange their changes. In most cases, such a remote repository is stored on a code hosting service like GitHub or on an internal server.In contrast to a local repository, a remote typically does not provide a file tree of the project's current state. Instead, it only consists of the .git versioning data.

Here are a list of other commands that you will see often and their uses:

1.  git init -> initializes on the current location
2.  git init <name> -> initializes on the current location inside a folder <name>
3.  git status - shows if there is any change displays "untracked file" if a new file is created but not committed
4.  git add <name> -> stages only the <name> file 
5.  git rm --cache <name> -> unstages the <name> file
6.  git config --global user.name "<Username>" -> configures the global username as the given username
7.  git config --global user.email "user@email.com" -> configures the global email as the giver email
8.  git commit -> Adds staged changes to your local repository
9.  git push “remote” “ branch” -> Push local repository changes to your hosting service
10. git pull “remote” “ branch” -> pull code from your hosting service to your local directory
11. git branch -> See local branches
12. git branch “newName” -> Create new local branch
13. git checkout “branchName” -> Switch branches
14. git diff -> See the actual difference in code between your working tree and your staging area
15. git log -> Show recent commit history
16. git show “commit_id” -> show details of specific commit


## **Collaboration and Contribution on GitHub**

For the beginners, the concept of GitHub may seem too complex at first. But if one follows a simple set of steps and patterns, it becomes a lot easier.

1.Fork the target repo to your own account.
2.Clone the repo to your local machine.
3.Check out a new "topic branch" and make changes.
4.Push your topic branch to your fork.
5.Use the diff viewer on GitHub to create a pull request via a discussion.
6.Make any requested changes.
7.The pull request is then merged (usually into the master branch) and the topic branch is deleted from the upstream (target) repo.

#### Step 1: Forking\
#### Step 2: Cloning\
             Clone the repo using the URL in the right sidebar.
#### Step 3: Adding the Upstream Remote\
          Change into the cloned directory and then at this point, you can add the upstream remote:
#### Step 4: Checking Out a Topic Branch\
          However, before you make your own changes, checkout a topic branch:
#### Step 5: Committing\
          Now, you can make your changes, and create a commit that tracks just those changes.
#### Step 6: Pushing\
          Next, you'll push this topic branch to your own fork of the project.
#### Step 7: Creating a Pull Request\
           Finally, you will create a pull request. First, go to your fork of the repo. You might see a "your recently pushed branches",  and if so, you can choose "Compare and Pull Request". Otherwise, you can select your branch from the dropdown, and subsequently click "Pull Request" or "Compare" at the top right of the repo section.
           
 ## **Branching**
A branch in Git is simply a lightweight movable pointer to one of these commits. The default branch name in Git is master . As you start making commits, you're given a master branch that points to the last commit you made. Every time you commit, the master branch pointer moves forward automatically.The belows shows the basic branching in git.

### Creating a New Branch
we use git branch (branchname) in order to create a new branch

### Switching Branches
To switch to an existing branch, you run the git checkout command. Let’s switch to the new testing branch.
 

### **Conclusion**


Hence, from the lab work we learn how to collaborate in a project using Git. We also learned how to work parallelly. The use of Git makes it easier to track changes, respond to additional requests.requirements so a version control system allows developers to revert and go back to an older version of the code.
