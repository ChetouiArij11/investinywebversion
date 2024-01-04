pipeline {
    agent any

    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17" 
        PATH = "${JAVA_HOME}\\bin:${DOCKER_PATH}:${PATH}"
        DOCKER_PATH = "C:\\Program Files\\Docker\\cli-plugins"
        NODEJS_PATH = "C:\\Program Files (x86)\\nodejs"
    }

    stages {
        stage('Install Node.js and npm') {
            steps {
                script {
                    def nodejs = tool name: 'NODEJS', type: 'jenkins.plugins.nodejs.tools.NodeJSInstallation'
                    env.PATH = "${nodejs}/bin:${env.PATH}"
                }
            }
        }

        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Update npm packages') {
            steps {
                script {
                    bat 'npm update'
                }
            }
        }

        stage('Build & rename Docker Image') {
            steps {
                script {
                    dir('InvestinyWeb') {
                        // Build and tag Docker image for Angular project
                        bat "docker build -t investinyangular:${BUILD_ID} ./"
                        bat "docker tag investinyangular:${BUILD_ID} arijchetoui1/investinyangular:${BUILD_ID}"
                    }
                }
            }
        }

        stage('Build Spring Boot Project') {
            steps {
                script {
                    dir('Investiny-backend') {
                        bat '.\\mvnw clean install'
                    }
                }
            }
        }

        stage('Docker Build and Push') {
            steps {
                script {
                    dir('Investiny-backend') {
                        bat 'docker build -t investinybackend ./'
                        bat "docker tag investinybackend:latest arijchetoui1/investinybackend:${BUILD_ID}"
                       // bat "docker push arijchetoui1/investinybackend:${BUILD_ID}"
                    }
                }
            }
        }

        stage('Run Docker Compose') {
            steps {
                script {
                    // Run Docker container using docker-compose
                    bat "docker-compose up -d"
                }
            }
        }
    }

   
}
