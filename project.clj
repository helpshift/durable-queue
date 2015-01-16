(defproject helpshift/durable-queue "0.1.5"
  :description "a in-process task-queue that is backed by disk."
  :url "https://github.com/helpshift/durable-queue"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/helpshift/durable-queue"}
  :dependencies [[com.taoensso/nippy "2.7.0"]
                 [primitive-math "0.1.3"]
                 [byte-streams "0.1.9"]
                 [manifold "0.1.0-beta7"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [criterium "0.4.3"]
                                  [codox-md "0.2.0" :exclusions [org.clojure/clojure]]]}}
  :global-vars {*warn-on-reflection* true}
  :test-selectors {:default #(not (some #{:benchmark :stress} (keys %)))
                   :benchmark :benchmark
                   :stress :stress}
  :plugins [[codox "0.6.6"]]
  :codox {:writer codox-md.writer/write-docs
          :include [durable-queue]}
  :jvm-opts ^:replace ["-server" "-Xmx100m"])
