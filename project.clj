(defproject trylobot/hive-ai-cheetah "0.1.0-SNAPSHOT"
  :description "A standard board game AI written for Hive using min/max move-tree search and alpha-beta pruning; max cpu threads, move depth, memory and compute time are configurable per request"
  :url "https://github.com/Trylobot/hive-ai-cheetah-clj"
  :license {:name "Research License 1.0"
            :url "https://github.com/Trylobot/hive-clj/blob/master/LICENSE.md"}
  :dependencies [
    [org.clojure/clojure "1.7.0"]
    [prismatic/schema "1.0.5"]
    [trylobot/hive "0.1.3-SNAPSHOT"]]
  :source-paths ["src"]
  :main ^:skip-aot hive.main
  :target-path "target/%s"
  :profiles {
    :uberjar {:aot :all} }
)
