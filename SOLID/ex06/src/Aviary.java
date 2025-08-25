class Aviary {
    IReleasable bird;

    public void release(IReleasable b){ 
        b.release(); 
    }
}