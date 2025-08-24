public class Player {
    private CacheService cacheService;
    private DecodeService decodeService;

    public Player(CacheService cacheService, DecodeService decodeService) {
        this.cacheService = cacheService;
        this.decodeService = decodeService;
    }

    void play(byte[] fileBytes){
        // decode
        Frame f = decodeService.decode(fileBytes);
        // draw UI
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // cache
        cacheService.cache(f);
    }
}