(ns clojure-noob.core
  (:gen-class))

(defn speech1 [hero]
  (println (str (hero :name)
                " pulls out his "
                (hero :weapon)
                "!")))

(def monstertypes ["ogre" "troll" "blastended skrewt"])

(defn mkhero [name weapon] {:name name
                            :weapon weapon
                            :hp 10
                            :strength (+ 1(rand-int 60))})

(defn mkmonster [] {:strength (+ 1(rand-int 15))
                    :hp 5
                    :type (get monstertypes (rand-int 4))})

(defn fight [hero monster] (if
                             (> (hero :strength) (monster :strength))
                             (println "hero wins!")
                             (println "monster wins")))

(defn ask_user [question] (do
                            (println (str question "?"))
                            (read-line)))

(def rusty (mkhero "rusty the rusty" "rusty can of rusty oil"))

(def yigdrasil (mkhero "yigdrasil the bold" "sword of yigdrasil"))

(def heroes [yigdrasil rusty])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Im Charlie!")
  (def name (ask_user "whats your name"))
  (def weapon (ask_user "whats your weapon"))
  (def hero (mkhero name weapon))
  (println "your hero is " hero)
  (def monster (mkmonster))
  (println "you are fighting a " monster "(until your doom)")
  (fight hero monster)
  )
