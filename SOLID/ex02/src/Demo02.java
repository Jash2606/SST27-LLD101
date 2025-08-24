public class Demo02 {
    public static void main(String[] args) {
        CacheMethod cacheMethod = new DefaultCache();
        CacheService cacheService = new CacheService(cacheMethod);
        Player player = new Player(cacheService, new DecodeService());
        player.play(new byte[]{1,2,3,4});
    }
}
