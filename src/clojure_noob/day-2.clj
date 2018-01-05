(def inventory
  [{:item :rainbow-rod :count 1 :modifier :mythical}
   {:item :heal-potion :count 25 :modifier :greater}
   {:item :nuclear :count 2 :modifier :enormous}
   {:item :last-prism :count 1 :modifier :legendary}])

(def item-list
  {:rainbow-rod {:name "Rainbow Rod"
                 :type :magic
                 :damage 112}
   :heal-potion {:name "Healing Potion"
                 :type :potion}
   :nuclear     {:name "Kim's Nuclear Button"
                 :type :bomb
                 :damage 500}
   :last-prism {:name "Last Prism"
                :type :magic
                :damage 300}})

; (:rainbow-rod item-list)
; (item-list :rainbow-rod)

(defn total-damage [inv]
  (reduce +
    (map #(or % 0)
      (map :damage
        (map item-list
           (map :item inv))))))

(defn damage-per-stack [{:keys [count item]}]
  (* count
    (or (:damage (item-list item)) 0)))

(defn counted-damage [inv]
  (reduce +
    (map damage-per-stack inv)))

(counted-damage inventory)

(defn item-count [inv]
  (reduce +
    (map :count inv)))

(total-damage inventory)

; (into [:jewel]
;   (set [:fruit :fruit :tea :fruit]))
;
; (loop [iter 0]
;   (println "Iteration" iter)
;   (if (> iter 3)
;     (println "Bye")
;     (recur (inc iter))))
;
; (defn abrahamic? [name]
;   (boolean (re-find #"^Al-" name)))
;
; (abrahamic? "Jesus")
; (abrahamic? "Al-Quran")
; (abrahamic? "Al-Jazeera")
;
; (defn match-part [part]
;   {:name (clojure.string/replace (:name part) #"^left-" "right-")
;    :size (* 2 (:size part))})
;
; (match-part {:name "left-eye" :size 5})

; (def x 5)
;
; (let [x (inc x)] (+ x 1))
;
; (str x)
;
; (def names
;   ["John" "Jerry" "Joe" "Jane" "Jury"])
;
; (let [first-two (take 2 names)]
;   (str "First Two is "
;     (clojure.string/join " and " first-two)))
;
; (let [[leader co-leader & friends] names]
;   (str
;    leader
;    " is the group leader, along with "
;    co-leader
;    ". They're friends with "
;    (clojure.string/join ", " friends)))
