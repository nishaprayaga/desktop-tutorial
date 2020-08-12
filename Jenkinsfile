

pipeline{
   agent any
    stages {
	     stage ('.....clean'){
		    steps{
			    echo "hello"
				}
			}
			stage('...test..'){
			steps{
			echo "hello"
			}
			}
			stage('...run deploy..'){
			 steps{
			echo "done"
			 }
			 }
	    
	     stage("Get source code") {
			steps {
				checkout([
					$class: "GitSCM",
					branches: [[name: "origin-pull/pull/${GITHUB_PR_NUMBER}/merge"]],
					doGenerateSubmoduleConfigurations: false,
					extensions: [],
					submoduleCfg: [],
					userRemoteConfigs: [
						[
							credentialsId: "abc123",
							name: "origin-pull",
							refspec: "+refs/pull/${GITHUB_PR_NUMBER}/merge:refs/remotes/origin-pull/pull/${GITHUB_PR_NUMBER}/merge",
							url: "git@github.com:yourorg/yourrepo.git"
						]
					]
				])
			}
		}
    }
		
			post {
		success {
			githubPRComment comment: githubPRMessage("XXX from [build ${BUILD_NUMBER}](${BUILD_URL})."), statusVerifier: allowRunOnStatus("SUCCESS"), errorHandler: statusOnPublisherError("UNSTABLE")
		}
	}
    
		
	}
