pipeline {

    agent any

    tools {
        maven 'Maven-3.9.16'
    }

    options {
        skipDefaultCheckout(true)
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                bat 'if not exist "E:\\Jenkins\\deploy" mkdir "E:\\Jenkins\\deploy"'
                bat 'copy /Y "target\\hello-jenkins-1.0-SNAPSHOT.jar" "E:\\Jenkins\\deploy\\hello-jenkins.jar"'
                bat 'java -jar "E:\\Jenkins\\deploy\\hello-jenkins.jar"'
            }
        }
    }
}