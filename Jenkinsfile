pipeline {
    agent any

    environment {
        DOCKER_PATH = "C:\\Program Files\\Docker\\cli-plugins"
        PATH = "${DOCKER_PATH}:${PATH}"
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

        stage('Build Angular') {
            steps {
                bat 'cd InvestinyWeb && npm install && ng build'
            }
        }

        stage('Build Spring Boot') {
            steps {
                bat 'cd Investiny-backend && ./mvnw clean install'
            }
        }

       stage('Build Docker Images') {
    steps {
        script {
            docker.build('investinyangular', './InvestinyWeb')
            docker.build('investinybackend', './Investiny-backend')
        }
    }
}

        stage('Build & rename Docker Image') {
            steps {
                script {
                    bat "docker build -t investinyweb:${BUILD_ID} ."
                    bat "docker tag investinyweb:${BUILD_ID} arijchetoui1/investinyweb:${BUILD_ID}"
                }
            }
        }

        stage('Run Docker Compose') {
            steps {
                script {
                    bat 'docker-compose up -d'
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    def newContainerName = "investinycontainer_${BUILD_ID}"
                    bat "docker run -d -p 3333:80 --name ${newContainerName} arijchetoui1/investinyweb:${BUILD_ID}"
                }
            }
        }
    }

    post {
        always {
            script {
                bat 'docker-compose down'
            }
        }
    }
}
