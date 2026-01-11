pipeline {
    agent any

    stages {
        stage('Build the image') {
            steps {
               bat "docker build -t=cucumbertestcaseimage ."
                           }
        }

        stage('Making infra up for execution') {
            steps {
                bat "docker-compose up -d selenium-hub chrome firefox"
            }
            }


            stage('Execution on Chrome browser') {
            steps {
                bat "docker-compose up cucumber-testcase-chrome"
            }
                post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'dockerreportchrome/index.html', body: '''<div style="font-family: Arial, sans-serif; line-height: 1.6;">
  <h2 style="color: #2E86C1;">🚀 Project Name: <span style="color: #1ABC9C;">Execution of a project</span></h2>
  
  
  
  <p>
    <strong>Description:</strong><br>
    <span style="color: #34495E;">
      This project is responsible for the automated build and test <strong>AwesomeApp</strong> application.
      It integrates with GitHub, runs regression tests, performs static analysis, and have an attachment with this email.
    </span>
  </p>

  <hr style="border-top: 1px dashed #ccc;">

  <h3 style="color: #8E44AD;">📦 Things to remember</h3>
  <ul style="color: #2C3E50;">
    <li>🔧 Dont need to get the latest code</li>
    <li>🧪 Directly execute the test</li>
    <li>🔍 click build now button</li>
  </ul>

  <h3 style="color: #E67E22;">📅 Last Updated:</h3>

  <h3 style="color: #C0392B;">🧑‍💻 Maintainer</h3>
</div>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email notifier', to: 'malimanthan56@gmail.com'
        }
    }
        }

        stage('Execution on Firefox browser') {
            steps {
                bat "docker-compose up cucumber-testcase-firefox"
            }
                post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'dockerreportfirefox/index.html', body: '''<div style="font-family: Arial, sans-serif; line-height: 1.6;">
  <h2 style="color: #2E86C1;">🚀 Project Name: <span style="color: #1ABC9C;">Execution of a project</span></h2>
  
  
  
  <p>
    <strong>Description:</strong><br>
    <span style="color: #34495E;">
      This project is responsible for the automated build and test <strong>AwesomeApp</strong> application.
      It integrates with GitHub, runs regression tests, performs static analysis, and have an attachment with this email.
    </span>
  </p>

  <hr style="border-top: 1px dashed #ccc;">

  <h3 style="color: #8E44AD;">📦 Things to remember</h3>
  <ul style="color: #2C3E50;">
    <li>🔧 Dont need to get the latest code</li>
    <li>🧪 Directly execute the test</li>
    <li>🔍 click build now button</li>
  </ul>

  <h3 style="color: #E67E22;">📅 Last Updated:</h3>

  <h3 style="color: #C0392B;">🧑‍💻 Maintainer</h3>
</div>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email notifier', to: 'malimanthan56@gmail.com manthan60@gmail.com'
        }
    }
        }

    }
}
