(ns hive.ai.cheetah (:gen-class))
(require '[hive.main :as hive])

; limits
(def max-cpu-threads                 "maximum active process threads"           4     )
(def max-move-depth                  "maximum move lookahead"                   8     )
(def max-memory                      "maximum amount of memory used, in GB"     1.024 )
(def max-time                        "maximum time taken, in seconds"          10     )

; heuristics constants
(def opponent-queen-adjacency-factor "value of surrounding the enemy queen"     3     )
(def self-queen-adjacency-factor     "value of protecting own queen"           -1     )

