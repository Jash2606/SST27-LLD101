public class CacheService {
    CacheMethod cacheMethod;
    public CacheService(CacheMethod cacheMethod) {
        this.cacheMethod = cacheMethod;
    }
    void cache(Frame frame) {
        cacheMethod.cache(frame);
    }
}
