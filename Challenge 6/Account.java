public abstract class Account{
    protected int id;
    protected String name;
    private DataSource myDataSource;
    

    public void performOperation(DataSource _myData){
		myDataSource = _myData;
		myDataSource.execute();
	}
    
}
