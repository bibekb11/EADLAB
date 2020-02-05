# **Lab1**
# **Objective : Source Code Management**
# **Date : 6th feb 2020**

# **Theory :**
 
## **Source Code Management**
A Source Code Management (SCM) is a software tool used by programmers to manage the source codes.
SCMs are used to give versions/revisions to the program. Each version is given a timestamp and include the person responsible for the change. Even various versions can be compared and merged with other versions. This is why SCM is also referred to Version Control, Revision Control or Source Control.

## **Types of Version Vontrol System**
There are two main types of version control system.

### 1. Centralized Version Control System
The main concept of Centralized Version Control is that it works in a client and server relationship. The repository is located in one place and allows access to multiple clientsIt’s very similar to FTP where you have FTP clients which connect to FTP server. Here all the user changes and commits have to pass through the central server. 

### 2. Distributed Version Control System
These systems are newer to use. In Distributed Version Control, each user has their own copy of the entire repository as well as the files and history. For Ex: Git and Mercurial

#### **Git as a Source Code Management**
Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.Git is easy to learn and has a tiny footprint with lightning fast performance. It outclasses SCM tools like Subversion, CVS, Perforce, and ClearCase with features like cheap local branching, convenient staging areas, and multiple workflows.s

**Workflow of Git**

![Git Worlkflow](https://github.com/SagarGi/EADLAB/blob/master/Lab1/gitworkflow.jfif)

**1. Working Directory:**
The Working Directory is the area where you are currently working. It is where your files live. This area is also known as the “untracked” area of git. Any changes to files will be marked and seen in the Working Directory. Here if you make changes and do not explicitly save them to git, you will lose the changes made to your files. Run the command git --status. This command will show you two things: The files in your Working Tree and the files in your Staging Area. It will look something like the image below if you don’t have anything in your Staging Area.We use git --init to initialize the working directory.

**2. Staging Area:**
The Staging Area is when git starts tracking and saving changes that occur in files. These saved changes reflect in the .git directory. That is about it when it comes to the Staging Area. You tell git that I want to track these specific files, then git says okay and moves them from you Working Tree to the Staging Area and says “Cool, I know about this file in its entirety.”. Running the command git add #filename# will add a specific file to the Staging Area from your Working Tree. If you want to add everything from the Working Tree, then run the command git add . The . operator is a wildcard meaning all files.

**3. Local Repository:**
The Local Repository is everything in your .git directory. Mainly what you will see in your Local Repository are all of your checkpoints or commits. It is the area that saves everything (so don’t delete it). That’s it.How do you add items from your Staging Area to your Local Repository? The git command git commit takes all changes in the Staging Area, wraps them together and puts them in your Local Repository. A commit is simply a checkpoint telling git to track all changes that have occurred up to this point using our last commit as a comparison. After committing, your Staging Area will be empty.

**4. Rmote Repository**
A remote in Git is a common repository that all team members use to exchange their changes. In most cases, such a remote repository is stored on a code hosting service like GitHub or on an internal server.In contrast to a local repository, a remote typically does not provide a file tree of the project's current state. Instead, it only consists of the .git versioning data.

Here are a list of other commands that you will see often and their uses:
git init → Create a new git repository.\
git add “newfile” → Add a new file to your staging area.\
git commit → Adds staged changes to your local repository.\
git push “remote” “ branch” → Push local repository changes to your hosting service\
git pull “remote” “ branch” → pull code from your hosting service to your local directory\
git branch → See local branches\
git branch “newName” → Create new local branch\
git checkout “branchName” → Switch branches\
git diff → See the actual difference in code between your working tree and your staging area\
git status → Show which files are being tracked v. untracked\
git log → Show recent commit history\
git show “commit_id” → show details of specific commit\
git stash → stash working directory\
git help → manpages for git\
git help “gitCommand”

## **Collaboration and Contribution on GitHub**

The workflow for contributing code can seem daunting at first. The most important thing to remember is to follow the patterns and standards outlined by the project you are working on (as we have already discussed). The general workflow that GitHub supports is fairly simple.

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

### **Conclusion**


From the above lab session we can conclude that Real life projects generally have multiple developers working in parallel. So a version control system like Git is needed to ensure there are no code conflicts between the developers.Additionally, the requirements in such projects change often. So a version control system allows developers to revert and go back to an older version of the code.Finally, sometimes several projects which are being run in parallel involve the same codebase. In such a case, the concept of branching in Git is very important.
