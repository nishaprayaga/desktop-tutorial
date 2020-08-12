#!/usr/bin/env groovy
node{
  	     stage ('.....clean'){
		    steps{
			    echo "hello"
				}
			}
			stage('...test..'){
			steps{
		def externalMethod = evaluate readFile("continuousBuildGW.groovy")
			}
			}

}
