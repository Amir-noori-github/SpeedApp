pipeline {
    agent any
    tools {
    maven 'Maven-3.9.12'
    }
    stages {
        stage('Check') {
            steps {
                git 'https://github.com/Amir-noori-github/SpeedApp.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install' // sh for linux and ios
            }
        }

        stage('Generate Report') {
            steps {
                bat 'mvn jacoco:report'
            }
        }

        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}