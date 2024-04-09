pipeline {
    agent any
    stages {
        stage('Build test code') {
            steps {
                sh 'mvn clean install - DskipTests'
            }
        }
        stage('Execute tests') {
            steps {
                sh 'mvn test'
            }
        }

        }
}