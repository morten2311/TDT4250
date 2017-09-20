/**
 */
package course_desc;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Person#getPersonNr <em>Person Nr</em>}</li>
 *   <li>{@link course_desc.Person#getName <em>Name</em>}</li>
 *   <li>{@link course_desc.Person#getHasRole <em>Has Role</em>}</li>
 *   <li>{@link course_desc.Person#getFullName <em>Full Name</em>}</li>
 *   <li>{@link course_desc.Person#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyLetters onlyElevenNumbers personNRnotEmpty'"
 *        annotation="xhttp://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onlyElevenNumbers='self.personNr.toString().size() = 11'"
 *        annotation="xhttp://www.eclipse.org/emf/2002/Ecore/OCL/Pivot personNRnotEmpty='self.personNr -&gt; isEmpty()'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Person Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Nr</em>' attribute.
	 * @see #setPersonNr(BigInteger)
	 * @see course_desc.Course_descPackage#getPerson_PersonNr()
	 * @model
	 * @generated
	 */
	BigInteger getPersonNr();

	/**
	 * Sets the value of the '{@link course_desc.Person#getPersonNr <em>Person Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Nr</em>' attribute.
	 * @see #getPersonNr()
	 * @generated
	 */
	void setPersonNr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course_desc.Course_descPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course_desc.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Role</b></em>' reference list.
	 * The list contents are of type {@link course_desc.PersonRole}.
	 * It is bidirectional and its opposite is '{@link course_desc.PersonRole#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Role</em>' reference list.
	 * @see course_desc.Course_descPackage#getPerson_HasRole()
	 * @see course_desc.PersonRole#getLinkedTo
	 * @model opposite="linkedTo"
	 * @generated
	 */
	EList<PersonRole> getHasRole();

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see course_desc.Course_descPackage#getPerson_FullName()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.name.concat(\' \').concat(self.lastName)\r\n'"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link course_desc.Person#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see course_desc.Course_descPackage#getPerson_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link course_desc.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

} // Person
