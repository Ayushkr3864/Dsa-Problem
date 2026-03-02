/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = new Map();

    return function(...args) {
        // create a unique key from arguments
        const key = JSON.stringify(args);

        // if result already exists → return from cache
        if (cache.has(key)) {
            return cache.get(key);
        }

        // else compute and store
        const result = fn(...args);
        cache.set(key, result);

        return result;
    };
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */