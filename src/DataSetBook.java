
import java.util.ArrayList;

/**
 * A simple store for Book objects.
 * 
 * @author student
 *
 */
public class DataSetBook implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Media> data;

	/**
	 * Default constructor
	 */
	public DataSetBook() {
		data = new ArrayList<>();
	}
	
	/**
	 * Add a Book to the store
	 * 
	 * @param objToAdd
	 * 
	 * @return true if the element was added to the collection, false otherwise
	 */
	public boolean add(Book objToAdd) {
		return data.add(objToAdd);
	}
	
	public boolean add(Video objToAdd) {
		return data.add(objToAdd);
	}
	
	
	
	/**
	 * The number of Books currently in the store
	 * 
	 * @return number of Book objects
	 */
	public int size() {
		return data.size();
	}
	
	
	/**
	 * Determine the Book with the fewest pages
	 * 
	 * @return null if the store is empty.  The book with the fewest pages
	 * otherwise.  If more than one book has the fewest number of pages,
	 * the first one is returned.
	 */
	public Book getMin() {
		if (data.isEmpty()) {
			return null;
		}
		Book mEle = (Book) data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (mEle.getPages() > (((Book) data.get(i)).getPages())) {
				mEle = (Book) data.get(i);
			}
		}
		return mEle;
	}

	/**
	 * Determine the Book with the most pages
	 * 
	 * @return null if the store is empty.  The book with the most pages
	 * otherwise.  If more than one book has the most number of pages,
	 * the first one is returned.
	 */
	public Book getMax() {
		if (data.isEmpty()) {
			return null;
		}
		Book mEle = (Book) data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (mEle.getPages() < (((Book) data.get(i)).getPages())) {
				mEle = (Book) data.get(i);
			}
		}
		return mEle;
	}

	/**
	 * A String representation of the store.
	 * 
	 * @return A String containing the number of books in the store, 
	 * and the contents of the entire store.
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("DataSetBook Size = " + size());
		sb.append("\n");
			for (Media m : data) 
				if (m instanceof Book)
					sb.append(m);
					sb.append("\n");
			
				for (Media m : data)
					if (m instanceof Video)
						sb.append(m);
						sb.append("\n");
				
				return sb.toString();
			
			
		}
		
	
	}

