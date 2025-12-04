pipeline {
    agent any

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("testng-parallel-image")
                }
            }
        }

        stage('Run Tests inside Docker') {
            steps {
                script {
                    dockerImage.run(
                        "-v C:/testng-reports:/automation/reports"
                    )
                }
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: 'C:/testng-reports/**', allowEmptyArchive: true
            }
        }

        stage('Email Reports') {
            steps {
                emailext (
                    to: "malimanthan56@gmail.com",
                    subject: "Parallel TestNG Report - Docker Execution",
                    body: "Please find attached the TestNG reports.",
                    attachmentsPattern: "C:/testng-reports/*/.html"
                )
            }
        }
    }
}