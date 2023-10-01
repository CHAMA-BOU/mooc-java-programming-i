import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;



public class ExerciseManagementTest {
    ExerciseManagement management;
    
    @Before
    public void initialyze(){
        this.management= new ExerciseManagement(); 
    }
    
    @Test    
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, this.management.exerciseList().size());    
    }
    
    @Test    
    public void addingExerciseGrowsListByOne() {       
        this.management.add("Write a test");        
        assertEquals(1, this.management.exerciseList().size());    
    }
    
    @Test    
    public void addedExerciseIsInList() {       
        management.add("Write a test");        
        assertTrue(management.exerciseList().contains("Write a test"));    
    }
    
    @Test
    public void exerciseCanBeMarketAsCompleted(){
        management.add("exo1");
        management.markAsCompleted("exo1");
        assertTrue(management.isCompleted("exo1"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        management.add("exo1");
        management.markAsCompleted("exo1");
        assertFalse(management.isCompleted("exo2"));
    }
    
    
}
