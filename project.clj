(defproject lein-dist "0.1.0"
  :description "Package a lein project for distribution with all dependencies"
  :url "httpd://github.com/palletops/lein-dist"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[lein-swank "1.4.4"]
            [lein-pprint "1.1.1"]
            [lein-clojars "0.9.1"]]
  
  :dependencies [[org.apache.ant/ant "1.8.2"]]

  :min-lein-version "2.0.0"

  :eval-in-leiningen true)
