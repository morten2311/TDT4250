/**
 */
package course_desc.impl;

import course_desc.CourseInstance;
import course_desc.Course_descPackage;
import course_desc.Person;
import course_desc.PersonRole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.PersonRoleImpl#getLinkedTo <em>Linked To</em>}</li>
 *   <li>{@link course_desc.impl.PersonRoleImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonRoleImpl extends MinimalEObjectImpl.Container implements PersonRole {
	/**
	 * The cached value of the '{@link #getLinkedTo() <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTo()
	 * @generated
	 * @ordered
	 */
	protected Person linkedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.PERSON_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getLinkedTo() {
		if (linkedTo != null && linkedTo.eIsProxy()) {
			InternalEObject oldLinkedTo = (InternalEObject)linkedTo;
			linkedTo = (Person)eResolveProxy(oldLinkedTo);
			if (linkedTo != oldLinkedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Course_descPackage.PERSON_ROLE__LINKED_TO, oldLinkedTo, linkedTo));
			}
		}
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetLinkedTo() {
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedTo(Person newLinkedTo, NotificationChain msgs) {
		Person oldLinkedTo = linkedTo;
		linkedTo = newLinkedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Course_descPackage.PERSON_ROLE__LINKED_TO, oldLinkedTo, newLinkedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedTo(Person newLinkedTo) {
		if (newLinkedTo != linkedTo) {
			NotificationChain msgs = null;
			if (linkedTo != null)
				msgs = ((InternalEObject)linkedTo).eInverseRemove(this, Course_descPackage.PERSON__HAS_ROLE, Person.class, msgs);
			if (newLinkedTo != null)
				msgs = ((InternalEObject)newLinkedTo).eInverseAdd(this, Course_descPackage.PERSON__HAS_ROLE, Person.class, msgs);
			msgs = basicSetLinkedTo(newLinkedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.PERSON_ROLE__LINKED_TO, newLinkedTo, newLinkedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getBelongsTo() {
		if (eContainerFeatureID() != Course_descPackage.PERSON_ROLE__BELONGS_TO) return null;
		return (CourseInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(CourseInstance newBelongsTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsTo, Course_descPackage.PERSON_ROLE__BELONGS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(CourseInstance newBelongsTo) {
		if (newBelongsTo != eInternalContainer() || (eContainerFeatureID() != Course_descPackage.PERSON_ROLE__BELONGS_TO && newBelongsTo != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE, CourseInstance.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.PERSON_ROLE__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.PERSON_ROLE__LINKED_TO:
				if (linkedTo != null)
					msgs = ((InternalEObject)linkedTo).eInverseRemove(this, Course_descPackage.PERSON__HAS_ROLE, Person.class, msgs);
				return basicSetLinkedTo((Person)otherEnd, msgs);
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsTo((CourseInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.PERSON_ROLE__LINKED_TO:
				return basicSetLinkedTo(null, msgs);
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				return eInternalContainer().eInverseRemove(this, Course_descPackage.COURSE_INSTANCE__HAS_PERSON_ROLE, CourseInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.PERSON_ROLE__LINKED_TO:
				if (resolve) return getLinkedTo();
				return basicGetLinkedTo();
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				return getBelongsTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.PERSON_ROLE__LINKED_TO:
				setLinkedTo((Person)newValue);
				return;
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				setBelongsTo((CourseInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.PERSON_ROLE__LINKED_TO:
				setLinkedTo((Person)null);
				return;
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				setBelongsTo((CourseInstance)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.PERSON_ROLE__LINKED_TO:
				return linkedTo != null;
			case Course_descPackage.PERSON_ROLE__BELONGS_TO:
				return getBelongsTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonRoleImpl
