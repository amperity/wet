(defproject amperity/wet "0.2.3-SNAPSHOT"
  :description "Liquid in Clojure"
  :url "https://github.com/amperity/wet"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [instaparse "1.4.12"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :sign-releases false}]])
