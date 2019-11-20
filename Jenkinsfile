pipeline {
    agent any
    environment {
    	VERSION = readMavenPom().getVersion()
    }
    stages {
	stage('Version') {
            steps {
		   echo "${VERSION}"
            }
        }
        stage('Testing a Ryan') {
            steps {
		   sh 'mvn test -Dtest=ControllerAndServiceSuite'
		   sh 'mvn test -Dtest=IntegrationSuite'
            }
        }
        stage('Building a Ryan') {
            steps {
                   sh 'mvn package -DskipTests'
		   sh 'docker build -t="rakimsv/simple-project:0.1.0" .'
            }
        }
	stage('Deploying a Ryan') {
            steps {
		   sh 'docker push "rakimsv/simple-project:0.1.0"'
                   echo "Deploy"
            }
        }
	stage('Testing Ryans Environment') {
            steps {
                   echo "hello"
            }
        }
        stage('Staging a Ryan') {
            when {
		  expression {
			      env.BRANCH_NAME=='developer' || env.BRANCH_NAME=='master'			      
		  }
	    }
	    steps {
                   echo "Staging"
            }
        }
        stage('A Ryan is in Production') {
            when {
		  expression {
			      env.BRANCH_NAME=='master'
		  }
	    } 
	    steps {
                   echo "Production"
            }
        }
    }
} 

