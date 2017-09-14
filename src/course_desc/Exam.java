/**
 */
package course_desc;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Exam#getDate <em>Date</em>}</li>
 *   <li>{@link course_desc.Exam#getPlace <em>Place</em>}</li>
 *   <li>{@link course_desc.Exam#getDuration <em>Duration</em>}</li>
 *   <li>{@link course_desc.Exam#getHasRegisteredStudents <em>Has Registered Students</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getExam()
 * @model
 * @generated
 */
public interface Exam extends Evaluation {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see course_desc.Course_descPackage#getExam_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link course_desc.Exam#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see course_desc.Course_descPackage#getExam_Place()
	 * @model
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link course_desc.Exam#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see course_desc.Course_descPackage#getExam_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link course_desc.Exam#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Has Registered Students</b></em>' reference list.
	 * The list contents are of type {@link course_desc.Student}.
	 * It is bidirectional and its opposite is '{@link course_desc.Student#getHasExams <em>Has Exams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Registered Students</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Registered Students</em>' reference list.
	 * @see course_desc.Course_descPackage#getExam_HasRegisteredStudents()
	 * @see course_desc.Student#getHasExams
	 * @model opposite="hasExams"
	 * @generated
	 */
	EList<Student> getHasRegisteredStudents();

} // Exam
